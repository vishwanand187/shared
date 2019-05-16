package snakeproject;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.spi.AudioFileReader;


public class audio{

	AudioStream as,as1;
	InputStream in,in1;
	audio()
	{
		try{
			in = new FileInputStream("C:\\Users\\win7\\Downloads\\sna.wav");
			as = new AudioStream(in);   
			AudioPlayer.player.start(as); 
			
			//AudioData data = as.getData();
			//ContinuousAudioDataStream cas = new ContinuousAudioDataStream (data);
			//AudioPlayer.player.start (cas);
			    
		}
		catch(Exception e)
		{
			
		}
	}
	audio(int i)
	{
		
		if(i==2)

			if(i==2)
				try{
					in1 = new FileInputStream("D:\\sbullet\\button-14.wav");
					as1 = new AudioStream(in1);   
					AudioPlayer.player.start(as1); 
				}
				catch(Exception e)
				{
					
				}
			else
				
		try{
			in1 = new FileInputStream("D:\\musicf\\machine-gun-01.wav");
			as1 = new AudioStream(in1);   
			AudioPlayer.player.start(as1); 
		}
		catch(Exception e)
		{
			
		}
		
		
	}
	audio(char i)
	{
		try{
			in1 = new FileInputStream("D:\\sbullet\\button-14.wav");
			as1 = new AudioStream(in1);   
			AudioPlayer.player.start(as1); 
		}
		catch(Exception e)
		{
			
		}
		
	}
	audio(String i)
	{
		try{
			in1 = new FileInputStream("D:\\sbullet\\butt.wav");
			as1 = new AudioStream(in1);   
			AudioPlayer.player.start(as1); 
		}
		catch(Exception e)
		{
			
		}
		}
		
	
			
		
	
public static void main(String[] args) {
	audio ref=new audio();
		

		
	}


}


