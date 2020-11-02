package Assessment;

import javax.swing.*;

public class TestAlbum {
    public static void main(String[] args) {
        String text;
        String InputAString;
        int input;

        Album album1 = new Album();
        Song song1 = new Song();

        text="Name:  " +album1.getName()+
                "\n\nProducer:  " +album1.getProducer()+
                "\n\nRelease Year:  " +album1.getReleaseYear()+
                "\n\nNumber of Tracks:  " +Song.getTrackN()+
                "\n\nTotal playing Time:  " +song1.getDuration()+
                "\n\n\t\tAlbum Tracks:  " +album1.getTracks();

        JOptionPane.showMessageDialog(null,text,"Album Infprmation",
                JOptionPane.INFORMATION_MESSAGE);

        InputAString = JOptionPane.showInputDialog("Which track number would you like to play");
        input = InputAString.parse(InputAString);

        if()
    }
}
