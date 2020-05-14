package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView view = findViewById(R.id.videoView);
        view.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.rabbid));
        view.start();
        MediaPlayer music = MediaPlayer.create(this,R.raw.baby_laughing);
        music.start();
        music.release();
        music=null;



    }
}
