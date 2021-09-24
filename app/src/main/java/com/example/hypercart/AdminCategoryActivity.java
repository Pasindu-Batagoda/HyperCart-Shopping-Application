package com.example.hypercart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//Admin category activity to be used by the admin to add new products

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView tshirts, sportsTshirts, femaleDresses, sweaters;
    private ImageView glasses, hatsCaps, walletsBagsPurses, shoes;
    private ImageView headphonesHandsfree, Laptops, watches, mobilePhones;

    private Button logoutBtn, checkOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        logoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        checkOrdersBtn = (Button) findViewById(R.id.check_orders_btn);

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        checkOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);

            }
        });

        tshirts = (ImageView) findViewById(R.id.t_shirts);
        sportsTshirts = (ImageView) findViewById(R.id.sports_t_shirts);
        femaleDresses = (ImageView) findViewById(R.id.female_dresses);
        sweaters = (ImageView) findViewById(R.id.sweaters);
        glasses = (ImageView) findViewById(R.id.glasses);
        hatsCaps = (ImageView) findViewById(R.id.hats);
        walletsBagsPurses = (ImageView) findViewById(R.id.purses_bags_wallets);
        shoes = (ImageView) findViewById(R.id.shoes);
        headphonesHandsfree = (ImageView) findViewById(R.id.headphones_handsfree);
        Laptops = (ImageView) findViewById(R.id.laptop_pc);
        watches = (ImageView) findViewById(R.id.watches);
        mobilePhones = (ImageView) findViewById(R.id.mobilePhones);

        //When the user Click on tshirt category, send user to add new product activity
        tshirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);

                //Passing category name(tshirts) to the next activity. So the user can add new products under the specific category.
                intent.putExtra("category", "T shirts");
                startActivity(intent);

            }
        });

        //For sports tshirt category
        sportsTshirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);

                //Passing category name to the next activity. So the user can add new products under the specific category.
                intent.putExtra("category", "Sports TShirts");
                startActivity(intent);
            }
        });

        //For female dresses category
        femaleDresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);

                //Passing category name to the next activity. So the user can add new products under the specific category.
                intent.putExtra("category", "Female Dresses");
                startActivity(intent);
            }
        });

        //For sweaters category
        sweaters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);

                //Passing category name to the next activity. So the user can add new products under the specific category.
                intent.putExtra("category", "Sweaters");
                startActivity(intent);
            }
        });

        //For glasses category
        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);

                //Passing category name to the next activity. So the user can add new products under the specific category.
                intent.putExtra("category", "Glasses");
                startActivity(intent);
            }
        });

        //For hats and caps category
        hatsCaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);

                //Passing category name to the next activity. So the user can add new products under the specific category.
                intent.putExtra("category", "Hats Caps");
                startActivity(intent);
            }
        });

        //For wallets,bags and purses category
        walletsBagsPurses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);

                //Passing category name to the next activity. So the user can add new products under the specific category.
                intent.putExtra("category", "Wallets Bags Purses");
                startActivity(intent);
            }
        });

        //For shoes category
        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);

                //Passing category name to the next activity. So the user can add new products under the specific category.
                intent.putExtra("category", "Shoes");
                startActivity(intent);
            }
        });

        //For spots headphone handsfree category
        headphonesHandsfree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);

                //Passing category name to the next activity. So the user can add new products under the specific category.
                intent.putExtra("category", "Headphones Handsfree");
                startActivity(intent);
            }
        });

        //For Laptops category
        Laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);

                //Passing category name to the next activity. So the user can add new products under the specific category.
                intent.putExtra("category", "Laptops");
                startActivity(intent);
            }
        });

        //For watches category
        watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);

                //Passing category name to the next activity. So the user can add new products under the specific category.
                intent.putExtra("category", "Watches");
                startActivity(intent);
            }
        });

        //For Mobile phones category
        mobilePhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);

                //Passing category name to the next activity. So the user can add new products under the specific category.
                intent.putExtra("category", "Mobile phones");
                startActivity(intent);
            }
        });
    }
}
