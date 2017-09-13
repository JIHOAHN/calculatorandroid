package com.example.a1694174.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

private boolean player1Turn = true;
private List<ImageButton> clickedImageButtons = new ArrayList<>();
    private ImageButton imageButton;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;
    private ImageButton imageButton6;
    private ImageButton imageButton7;
    private ImageButton imageButton8;
    private ImageButton imageButton9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
    }

    public void ImageClicked(View v)
    {
        ImageButton button = (ImageButton) v;

        if(clickedImageButtons.contains(button))
        {
            return;
        }


        clickedImageButtons.add(button);
        if (player1Turn) {
        button.setImageResource(R.drawable.puppy);
            button.setTag(R.drawable.puppy);
            player1Turn = false;
    }
    else {
            button.setImageResource(R.drawable.kittten);
            button.setTag(R.drawable.kittten);
            player1Turn = true;
        }
        CheckForWinner();

        }
private void CheckForWinner() {

    if(imageButton.getTag() == imageButton2.getTag() && imageButton3.getTag() == imageButton.getTag())
    {
        Toast.makeText(this, "WINNER!!", Toast.LENGTH_SHORT).show();
    }

}

}
