package com.example.galeria1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        // URLs de las imágenes
        String[] imageUrls = {
                "https://imagenesdepaisajes.org/wp-content/uploads/2016/07/paisajes-bonitos-del-mundo-lago.jpg",
                "https://th.bing.com/th/id/R.72922b1acc05f4671214a4a783f036b4?rik=TRRvwD36dTZwpg&pid=ImgRaw&r=0",
                "https://th.bing.com/th/id/OIP.qWQ7k92W2H65K5FYkrpyTwHaE8?rs=1&pid=ImgDetMain",
                "https://th.bing.com/th/id/OIP.52xxZzwFGKyVvKp21D4AMAHaEE?rs=1&pid=ImgDetMain",
                "https://th.bing.com/th/id/OIP.XLYMOCGwrHOn4k_VM2eLMgHaEo?rs=1&pid=ImgDetMain",
                "https://th.bing.com/th/id/OIP.9YOOYmIhQGv-wTFpr3pL5AHaEK?rs=1&pid=ImgDetMain",
                "https://th.bing.com/th/id/R.fa04a87a1207d338b7d63d012a8b3a6a?rik=gLTMAl8Z8tGICg&pid=ImgRaw&r=0",
                "https://th.bing.com/th/id/OIP.46llUjRAK_o4r7Rm7_CiigHaEm?rs=1&pid=ImgDetMain",
        };

        // Configurar el ViewPager
        ImagePagerAdapter adapter = new ImagePagerAdapter(getSupportFragmentManager(), imageUrls);
        viewPager.setAdapter(adapter);

        // Configurar el TabLayout
        tabLayout.setupWithViewPager(viewPager);
    }
}