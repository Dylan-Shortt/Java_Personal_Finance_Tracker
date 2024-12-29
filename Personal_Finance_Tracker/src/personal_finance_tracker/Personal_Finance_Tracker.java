/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
package personal_finance_tracker;
//*************************************************//

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
//*************************************************//

//*************************************************//
public class Personal_Finance_Tracker {
    //*************************************************//
    /**
     * @param args the command line arguments
     */
    //*************************************************//
    
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //open the user selection window so that they can move through the window and update there expenditures
        user_selection_window selectionWindow = new user_selection_window();
        textToSpeech("... Welcome to your personal finance tracker");
        JOptionPane.showMessageDialog(null, "Welcome, choose any option below to manage your expenditures", "Application", JOptionPane.INFORMATION_MESSAGE);
        selectionWindow.setVisible(true);
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //method to speak aloud
    public static void textToSpeech(String text) 
    {
        //*************************************************//
        System.setProperty("freetts.voices",
            "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory," +
            "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory");
        //*************************************************//
    
        //*************************************************//
        //Fetching the voice to be used from the TTS engine
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice voice = voiceManager.getVoice("kevin16");
        //*************************************************//
    
        //*************************************************//
        if (voice != null) 
        {
            //*************************************************//
            voice.allocate();
            //*************************************************//
        
            //*************************************************//
            // Set parameters to approximate TTS
            voice.setRate(155);  // Moderate to fast speech rate
            voice.setPitch(120); // Neutral pitch
            voice.setVolume(2);  // Medium volume
            //*************************************************//
        
            //*************************************************//
            voice.speak(text);
            voice.deallocate();
            //*************************************************//
        }
        //*************************************************//
        
        //*************************************************//
        else 
        {
        System.err.println("Voice not found.");
        }
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//