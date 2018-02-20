package co.zaven.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.github.chrisbanes.photoview.PhotoView;

public class MainActivity extends AppCompatActivity
{

    PhotoView photoViewEdited;
    SubsamplingScaleImageView subsamplingScaleImageViewUnedited;
    SubsamplingScaleImageView subsamplingScaleImageViewEdited1;
    SubsamplingScaleImageView subsamplingScaleImageViewEdited2;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subsamplingScaleImageViewUnedited = findViewById(R.id.subscaleViewUnedited);
        subsamplingScaleImageViewEdited1 = findViewById(R.id.subscaleViewEdited1);
        subsamplingScaleImageViewEdited2 = findViewById(R.id.subscaleViewEdited2);

        //VALID PAN LIMITS ARE 1, 2, 3
        subsamplingScaleImageViewEdited1.setPanLimit(1);
        subsamplingScaleImageViewEdited1.setPanLimit(2);

        subsamplingScaleImageViewUnedited.setImage(ImageSource.resource(R.drawable.diamond));
        subsamplingScaleImageViewEdited1.setImage(ImageSource.resource(R.drawable.diamond));
        subsamplingScaleImageViewEdited2.setImage(ImageSource.resource(R.drawable.diamond));



    }
}
