package com.vanhuy.media;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(25, 30, 25, 30);
        layout.setBackgroundColor(Color.rgb(15, 15, 15));

        TextView title = new TextView(this);
        title.setText("VĂN HUY MEDIA");
        title.setTextSize(30);
        title.setTextColor(Color.rgb(212, 175, 55));
        title.setGravity(Gravity.CENTER);

        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("\nDỊCH VỤ HỖ TRỢ MẠNG XÃ HỘI");
        subtitle.setTextSize(16);
        subtitle.setTextColor(Color.WHITE);
        subtitle.setGravity(Gravity.CENTER);

        layout.addView(subtitle);

        String[] services = {
            "Hỗ trợ Facebook",
            "Hỗ trợ TikTok",
            "Hỗ trợ Instagram",
            "Hướng dẫn báo cáo vi phạm",
            "Liên hệ hỗ trợ"
        };

        for (String service : services) {
            Button button = new Button(this);
            button.setText(service);
            layout.addView(button);
        }

        setContentView(layout);
    }
}
