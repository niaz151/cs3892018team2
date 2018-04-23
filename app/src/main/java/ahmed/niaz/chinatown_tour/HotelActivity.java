package ahmed.niaz.chinatown_tour;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import org.w3c.dom.Text;

public class HotelActivity extends AppCompatActivity {

    // === LANDING PAGE WIDGETS ===

    private ImageView app_logo;
    private ListView listView;
    private ImageButton settings_btn;
    private ImageSwitcher img_switcher;

    // === SPECIFIC PAGE VARIABLES ===

    private int name;
    private int img_one;
    private int img_two;
    private int img_three;
    private int description;
    private int img_num;

    // === SPECIFIC PAGE WIDGETS ===

    private ImageView navdot1;
    private ImageView navdot2;
    private ImageView navdot3;
    private TextView spec_name;
    private TextView spec_description;


    // === SWITCH DEPENDING ON ITEM CLICKED ===

    public void createHotelData(int x){
        switch (x) {
            case 1:
                name = R.string.hotel1_name;
                img_one = R.drawable.hotel1_image1;
                img_two = R.drawable.hotel1_image2;
                img_three = R.drawable.hotel1_image3;
                description = R.string.hotel1_description;
                break;

            case 2:
                name = R.string.hotel2_name;
                img_one = R.drawable.hotel2_image3;
                img_two = R.drawable.hotel2_image2;
                img_three = R.drawable.hotel2_image1;
                description = R.string.hotel2_description;
                break;

            case 3:
                name = R.string.hotel3_name;
                img_one = R.drawable.hotel3_image1;
                img_two = R.drawable.hotel3_image2;
                img_three = R.drawable.hotel3_image3;
                description = R.string.hotel3_description;
                break;

            case 4:
                name = R.string.hotel4_name;
                img_one = R.drawable.hotel4_image1;
                img_two = R.drawable.hotel4_image2;
                img_three = R.drawable.hotel4_image3;
                description = R.string.hotel4_description;
                break;

            case 5:
                name = R.string.hotel5_name;
                img_one = R.drawable.hotel5_image1;
                img_two = R.drawable.hotel5_image2;
                img_three = R.drawable.hotel5_image3;
                description = R.string.hotel5_description;
                break;

            case 6:
                name = R.string.hotel6_name;
                img_one = R.drawable.hotel6_image1;
                img_two = R.drawable.hotel6_image2;
                img_three = R.drawable.hotel6_image3;
                description = R.string.hotel6_description;
                break;

            case 7:
                name = R.string.hotel3_name;
                img_one = R.drawable.hotel7_image1;
                img_two = R.drawable.hotel7_image2;
                img_three = R.drawable.hotel7_image3;
                description = R.string.hotel7_description;
                break;

            case 8:
                name = R.string.hotel8_name;
                img_one = R.drawable.hotel8_image1;
                img_two = R.drawable.hotel8_image2;
                img_three = R.drawable.hotel8_image3;
                description = R.string.hotel8_description;
                break;

            case 9:
                name = R.string.hotel9_name;
                img_one = R.drawable.hotel9_image1;
                img_two = R.drawable.hotel9_image2;
                img_three = R.drawable.hotel9_image3;
                description = R.string.hotel9_description;
                break;

            case 10:
                name = R.string.hotel10_name;
                img_one = R.drawable.hotel10_image1;
                img_two = R.drawable.hotel10_image2;
                img_three = R.drawable.hotel10_image3;
                description = R.string.hotel10_description;
                break;

            case 11:
                name = R.string.hotel11_name;
                img_one = R.drawable.hotel1_image1;
                img_two = R.drawable.hotel1_image2;
                img_three = R.drawable.hotel1_image3;
                description = R.string.hotel1_description;
                break;

            case 12:
                name = R.string.hotel12_name;
                img_one = R.drawable.hotel12_image1;
                img_two = R.drawable.hotel12_image2;
                img_three = R.drawable.hotel12_image3;
                description = R.string.hotel12_description;
                break;

            case 13:
                name = R.string.hotel3_name;
                img_one = R.drawable.hotel13_image1;
                img_two = R.drawable.hotel13_image2;
                img_three = R.drawable.hotel13_image3;
                description = R.string.hotel13_description;
                break;

            case 14:
                name = R.string.hotel3_name;
                img_one = R.drawable.hotel14_image1;
                img_two = R.drawable.hotel14_image2;
                img_three = R.drawable.hotel14_image3;
                description = R.string.hotel14_description;
                break;

            case 15:
                name = R.string.hotel15_name;
                img_one = R.drawable.hotel15_image1;
                img_two = R.drawable.hotel15_image2;
                img_three = R.drawable.hotel15_image3;
                description = R.string.hotel15_description;
                break;

            case 16:
                name = R.string.hotel16_name;
                img_one = R.drawable.hotel16_image1;
                img_two = R.drawable.hotel16_image2;
                img_three = R.drawable.hotel16_image3;
                description = R.string.hotel16_description;
                break;

            case 17:
                name = R.string.hotel17_name;
                img_one = R.drawable.hotel17_image1;
                img_two = R.drawable.hotel17_image2;
                img_three = R.drawable.hotel17_image3;
                description = R.string.hotel17_description;
                break;

            case 18:
                name = R.string.hotel18_name;
                img_one = R.drawable.hotel18_image1;
                img_two = R.drawable.hotel18_image2;
                img_three = R.drawable.hotel18_image3;
                description = R.string.hotel18_description;
                break;

        }
    }

    // === ON CREATE ===

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_landing);


        // === Main Menu Link ===

        app_logo = (ImageView) findViewById(R.id.appIcon);
        app_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


        // === LIST PARAMETER CREATION ===

        Integer[] imageArray = {
                R.drawable.hotel1_image1,
                R.drawable.hotel2_image3,
                R.drawable.hotel3_image1,
                R.drawable.hotel4_image1,
                R.drawable.hotel5_image1,
                R.drawable.hotel6_image1,
                R.drawable.hotel7_image1,
                R.drawable.hotel8_image1,
                R.drawable.hotel9_image1,
                R.drawable.hotel10_image1,
                R.drawable.hotel11_image1,
                R.drawable.hotel12_image1,
                R.drawable.hotel13_image1,
                R.drawable.hotel14_image1,
                R.drawable.hotel15_image1,
                R.drawable.hotel16_image1,
                R.drawable.hotel17_image1,
                R.drawable.hotel18_image1,
        };

        String[] names = getResources().getStringArray(R.array.hotel_names);
        String[] descriptions = getResources().getStringArray(R.array.hotel_descriptions_preview);


        // === LIST CREATION ===

        CustomListAdapter whatever = new CustomListAdapter(this, names, descriptions, imageArray);
        listView = (ListView) findViewById(R.id.listViewID);
        listView.setAdapter(whatever);


        // === ADD EVENT LISTENER TO EVERY VIEW ===

        listView.setOnItemClickListener(new OnItemClickListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                createHotelData(position+1);
                setContentView(R.layout.specific_hotel_content);

                // === ASSIGN INFO TO SPECIFIC PAGE WIDGETS ===

                img_switcher = (ImageSwitcher) findViewById(R.id.img_switcher);
                app_logo = (ImageView) findViewById(R.id.appIcon);
                spec_name = (TextView) findViewById(R.id.spec_hotel_name);
                spec_description = (TextView) findViewById(R.id.spec_hotel_description);

                app_logo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(HotelActivity.this,MainActivity.class);
                        startActivity(intent);
                    }
                });

                // === ADD A VIEW TO THE IMG SWITCHER ===

                img_switcher.setFactory(new ViewSwitcher.ViewFactory() {
                    @Override
                    public View makeView() {
                        ImageView imageView = new ImageView(getApplicationContext());
                        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT));
                        return imageView;
                    }
                });

                // === ASSIGN PAGE VARIABLES TO WIDGETS ===

                     spec_name.setText(name);
                     spec_description.setText(description);
                     img_switcher.setImageDrawable(getResources().getDrawable(img_one));

                     // === IMG WHEEL ITERATION VARIABLE ===
                     img_num = 1;

                      // === IMAGE SCROLL DOTS ===

                     navdot1 = (ImageView) findViewById(R.id.navDot1);
                     navdot2 = (ImageView) findViewById(R.id.navDot2);
                     navdot3 = (ImageView) findViewById(R.id.navDot3);

                // === ON SWIPE LISTENER ===

                img_switcher.setOnTouchListener(new OnSwipeTouchListener(HotelActivity.this){

                    public void onSwipeLeft(){
                        if (img_num == 1){
                            img_switcher.setImageDrawable(getResources().getDrawable(img_two));
                            img_num = 2;


                            navdot2.setImageDrawable(getResources().getDrawable(R.drawable.active_circle));
                            navdot1.setImageDrawable(getResources().getDrawable(R.drawable.non_active_circle));

                        }
                        else if (img_num == 2){
                            img_switcher.setImageDrawable(getResources().getDrawable(img_three));
                            img_num = 3;

                            navdot3.setImageDrawable(getResources().getDrawable(R.drawable.active_circle));
                            navdot2.setImageDrawable(getResources().getDrawable(R.drawable.non_active_circle));
                        }
                    }

                    // === ON SWIPE LISTENER ===

                    public void onSwipeRight(){
                        if (img_num == 3){
                            img_switcher.setImageDrawable(getResources().getDrawable(img_two));
                            img_num = 2;

                            navdot2.setImageDrawable(getResources().getDrawable(R.drawable.active_circle));
                            navdot3.setImageDrawable(getResources().getDrawable(R.drawable.non_active_circle));

                        }
                        else if (img_num == 2){
                            img_switcher.setImageDrawable(getResources().getDrawable(img_one));
                            img_num = 1;

                            navdot1.setImageDrawable(getResources().getDrawable(R.drawable.active_circle));
                            navdot2.setImageDrawable(getResources().getDrawable(R.drawable.non_active_circle));

                        }
                    }

                });
            }
        });

        // === SETTINGS ICON LINK ===

        settings_btn = (ImageButton) findViewById(R.id.setting_image_button);
        settings_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelActivity.this,SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}


