/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import util.JsonParser;

/**
 *
 * @author duh_b
 */
public class EurBrl {
    
    public static String euroPrice() throws Exception {
		try {
			URL url = new URL("https://economia.awesomeapi.com.br/last/EUR-BRL");

			HttpURLConnection connect = (HttpURLConnection) url.openConnection();

			if (connect.getResponseCode() != 200)
				throw new RuntimeException("codigo de erro " + connect.getResponseCode());

			BufferedReader response = new BufferedReader(new InputStreamReader(connect.getInputStream()));

			String convert = JsonParser.converteJsonEmString(response);

			JSONObject obj = new JSONObject(convert);

			String stringname = obj.getJSONObject("EURBRL").getString("bid");

			return stringname;

		} catch (Exception e) {
			throw new Exception(e);
		}
	}
    
    public static double valorEuro() throws Exception {
                String euro = euroPrice();
		double europ = Double.parseDouble(euro);
                
                return europ;
    }
    
    public static double valorEuroDouble() throws Exception {
                String euro = euroPrice();
		double europ = Double.parseDouble(euro);
                
                return europ;
        }
    
    public static String valorEuroString() throws Exception {
            return String.format("%.2f", valorEuroDouble());
        }
    
    public static double converterEuro(double valor1, double europ) {
            return valor1 * europ;
    }
    
    
}
