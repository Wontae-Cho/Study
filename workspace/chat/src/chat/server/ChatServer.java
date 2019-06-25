package chat.server;

import java.net.*;
import java.io.*;
import java.util.*;
 
class  ChatServer
 
{
 
    int port = 6000;
    ServerSocket server = null;
    Socket child = null;
 
    HashMap<String, PrintWriter> hm;
 
    public ChatServer() {
 
        ChatSverThread sr;
        Thread t;
 
        try {
            server = new ServerSocket( port ); //���������� ����
             
            System.out.println( "**************************************" );
            System.out.println( "*              ä�� ����                *" );
            System.out.println( "**************************************" );
            System.out.println( "Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�." );
 
            hm = new HashMap<String, PrintWriter>();
 
            while( true ) {
                child = server.accept(); //Ŭ���̾�Ʈ�� ������ ����޽��ϴ�.
                if( child != null ) { //Ŭ���̾�Ʈ ���ϰ� �����
                    sr = new ChatSverThread( child, hm ); //ä�� �����带 �����մϴ�.
                    t = new Thread(sr); //ä�ý����带 �����մϴ�.
                    t.start();
                }
            }
        }
        catch ( Exception e )   {
            e.printStackTrace();
        }
    }
 
 
 
    public static void main(String[] args)
 
    {
        new ChatServer();
    }
 
}
