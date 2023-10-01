package org.example;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.IOException;


/*

    THIS CLASS will allow you to make a "GET" request to any HTTP address.

    For example, you can find an API somewhere that gives actual surf forecasts,
    rather than just using random numbers.

    Just call Requests.get("https://www.domain.tld&key=r8y3r95893reubfueib")
    with whatever link is necessary. It will return the source code, so try
    to find something that returns just CSV or JSON data. Java has libraries
    to parse JSON and CSV automatically.

    For my project, we used this class/method to get live stock prices using
    Finnhub API. I'm sure there are similar API's out there for surf forecasts.

    Good luck, Carlo! (:

    - Everett

 */

public class Requests {
    enum Protocol {
        GET
    }

    public static String request(Protocol method, String urlToRead, Map<String, String> headers, String body) throws MalformedURLException {
        StringBuilder result = new StringBuilder();
        try {
            URL url = new URL(urlToRead);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            System.out.println(method.toString());
            conn.setRequestMethod(method.toString());

            // if header is not null or empty
            if(!headers.isEmpty()) {
                for(Map.Entry<String,String> entry : headers.entrySet()) {
                    conn.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }

            // if body is not null or empty
            if(!(body.length() == 0)) {
                conn.setDoOutput(true);
                OutputStream outStream = conn.getOutputStream();
                OutputStreamWriter outStreamWriter = new OutputStreamWriter(outStream, "UTF-8");
                outStreamWriter.write(body);
                outStreamWriter.flush();
                outStreamWriter.close();
                outStream.close();
            }

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                for (String line; (line = reader.readLine()) != null; ) {
                    result.append(line);
                }
            }
        } catch(IOException e) {
            System.err.println(e);
        }
        return result.toString();
    }

    public static String get(String urlToRead) throws MalformedURLException {
        return request(Protocol.GET, urlToRead, Collections.<String, String>emptyMap(), new String());
    }
}
