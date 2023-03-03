package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import util.JsonParser;


public class BrlUsd {

	public static String realPrice() throws Exception {
		try {
			URL url = new URL("https://economia.awesomeapi.com.br/last/BRL-USD");

			HttpURLConnection connect = (HttpURLConnection) url.openConnection();

			if (connect.getResponseCode() != 200)
				throw new RuntimeException("codigo de erro " + connect.getResponseCode());

			BufferedReader response = new BufferedReader(new InputStreamReader(connect.getInputStream()));

			String convert = JsonParser.converteJsonEmString(response);

			JSONObject obj = new JSONObject(convert);

			String stringname = obj.getJSONObject("BRLUSD").getString("bid");

			return stringname;

		} catch (Exception e) {
			throw new Exception(e);
		}
	}
        
        public static double valorRealDouble() throws Exception {
                String real = realPrice();
		double realp = Double.parseDouble(real);
                
                return realp;
        }
        
        public static String valorrealString() throws Exception {
            return String.format("%.2f", valorRealDouble());
        }
        
        public static double converterReal(double valor1, double realp) {
            return valor1 * realp;
        }


        
      
}
