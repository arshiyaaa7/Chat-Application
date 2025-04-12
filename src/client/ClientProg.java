package client;
import java.io.*;
import java.net.*;

import java.net.Socket;

public class ClientProg
{
    public static void main(String[] args) throws Exception{
        Socket soc =  new Socket("localhost",6666);

        DataInputStream din = new DataInputStream(soc.getInputStream());
        DataOutputStream dout = new DataOutputStream(soc.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ser;
        String cli;

        while(true){

            //reading the data from input
            System.out.println("Enter Data for Server: ");
            cli = br.readLine();

            dout.writeUTF(cli);//to write data into socket
            dout.flush();//send the data to client(reciever)

            ser = din.readUTF();
            System.out.println("Server says: " + ser);

            if(ser.equals("exit")){
                break;
            }


        }
    }
}
