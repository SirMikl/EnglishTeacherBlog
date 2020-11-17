package com.example.englishteacherblog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AddPostActivity extends AppCompatActivity {
    EditText title_blog, description_blog;
    Button upload;
    ImageView blog_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);
        title_blog = findViewById(R.id.title_blog);
        description_blog=findViewById(R.id.desciption_blog);
        upload = findViewById(R.id.uploadBtn);
        blog_image = findViewById(R.id.blog_image);
    }
}