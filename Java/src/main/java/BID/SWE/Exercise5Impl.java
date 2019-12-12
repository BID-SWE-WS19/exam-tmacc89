package BID.SWE;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.LinkedList;

public class Exercise5Impl implements Exercise5
{

    @Override
    public Object Method1(String s, int i) {

        try {
            Socket socket = new Socket(s, i);
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while((line = bufferedReader.readLine()) != null) {
                LinkedList<String>.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
