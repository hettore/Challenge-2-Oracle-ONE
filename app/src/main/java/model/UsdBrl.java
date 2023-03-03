package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import util.JsonParser;


public class UsdBrl {

	public static String dolarPrice() throws Exception {
		try {
			URL url = new URL("https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL");

			HttpURLConnection connect = (HttpURLConnection) url.openConnection();

			if (connect.getResponseCode() != 200)
				throw new RuntimeException("codigo de erro " + connect.getResponseCode());

			BufferedReader response = new BufferedReader(new InputStreamReader(connect.getInputStream()));

			String convert = JsonParser.converteJsonEmString(response);

			JSONObject obj = new JSONObject(convert);

			String stringname = obj.getJSONObject("USDBRL").getString("bid");

			return stringname;

		} catch (Exception e) {
			throw new Exception(e);
		}
	}
        
        public static double valorDolarDouble() throws Exception {
                String dolar = dolarPrice();
		double dolarp = Double.parseDouble(dolar);
                
                return dolarp;
        }
        
        public static String valorDolarString() throws Exception {
            return String.format("%.2f", valorDolarDouble());
        }
        
        public static double converterDolar(double valor1, double dolarp) {
            return valor1 * dolarp;
        }


        
      
}
