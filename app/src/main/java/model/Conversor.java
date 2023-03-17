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
public class Conversor {
    
    public static String realPrice(String site, String code) throws Exception {
        
		try {
			URL url = new URL(site);

			HttpURLConnection connect = (HttpURLConnection) url.openConnection();

			if (connect.getResponseCode() != 200) {
				throw new RuntimeException("codigo de erro " + connect.getResponseCode());
                        }
                        
			BufferedReader response = new BufferedReader(new InputStreamReader(connect.getInputStream()));

			String convert = JsonParser.converteJsonEmString(response);

			JSONObject obj = new JSONObject(convert);

			String stringname = obj.getJSONObject(code).getString("bid");

			return stringname;

		} catch (Exception e) {
			throw new Exception(e);
		}
	}
        
        public static String valorRealDouble(String valor) throws Exception {
              
		double realp = Double.parseDouble(valor);
                return String.format("%.2f", realp);
                
        }
        
        public static double converterReal(double valor1, double realp) {
            return valor1 * realp;
        }
        
        //Conversão de temperatura
        
        public static double converterTemperaturaCToF(double celsius) {
             double fahrenheit = celsius * 1.8 + 32;
             return fahrenheit;
        }
        
        public static double converterTemperaturaCToK(double celsius) {
            double kelvin = celsius + 273.15;
            return kelvin;
        }
        
        public static double converterTemperaturaFToC(double fahrenheit) {
            double celsius = (fahrenheit - 32) / 1.8;
            return celsius;
        }
        
        public static double converterTemperaturaFToK(double fahrenheit) {
            double kelvin = ((fahrenheit - 32) * 5/9 + 273.15); 
            return kelvin;
        }
        
        public static double converterTemperaturaKToC(double kelvin) {
            double celsius = kelvin - 273.15;
            return celsius;
        }
        
        public static double converterTemperaturaKToF(double kelvin) {
            double fahrenheit = ((kelvin - 273.15) * 9/5 + 32);
            return fahrenheit;
        }
        
}
