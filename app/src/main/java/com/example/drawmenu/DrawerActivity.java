package com.example.drawmenu;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.drawmenu.databinding.ActivityDrawerBinding;

import me.toptas.fancyshowcase.FancyShowCaseQueue;
import me.toptas.fancyshowcase.FancyShowCaseView;

public class DrawerActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    ActivityDrawerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityDrawerBinding.inflate(getLayoutInflater())).getRoot());
        NavController navController = ((NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).getNavController();


        //Menu Inferior
        AppBarConfiguration appBarConfiguration2 = new AppBarConfiguration.Builder(
                R.id.inicioFragment, R.id.comprarVenderFragment
        )
                .build();

        NavigationUI.setupWithNavController(binding.bottomNavView, navController);
        NavigationUI.setupWithNavController(binding.toolbar, navController, appBarConfiguration2);


        //Menu Lateral
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                // Top-level destinations:
                R.id.inicioFragment, R.id.drawer1Fragment, R.id.drawer2Fragment, R.id.ajustesFragment,
                R.id.acercaDeFragment, R.id.ayudaSoporteFragment
        )
                .setOpenableLayout(binding.drawerLayout)
                .build();

        NavigationUI.setupWithNavController(binding.navView, navController);
        NavigationUI.setupWithNavController(binding.toolbar, navController, appBarConfiguration);



    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.idiomas_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.options1Fragment:
                //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.options2Fragment:
                //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.options3Fragment:
                //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.options4Fragment:
                //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.options5Fragment:
                //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.options6Fragment:
                //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }

    public void showPopupMoneda(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.moneda_menu);
        popup.show();
    }

    public void showPopupCriptos(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.criptos_menu);
        popup.show();
    }

    public void openDialogCache() {
        LimpiarCacheFragment dialogFragment = new LimpiarCacheFragment();
        dialogFragment.show(getSupportFragmentManager(), "example");
    }

    public void openDialogCompra() {
        DialogCompraFragment dialogFragment = new DialogCompraFragment();
        dialogFragment.show(getSupportFragmentManager(), "example");
    }

    public void openDialogVenta() {
        DialogVentaFragment dialogFragment = new DialogVentaFragment();
        dialogFragment.show(getSupportFragmentManager(), "example");
    }

    public void openDialogPruebadered() {
        PruebaDeRedDialog dialogFragment = new PruebaDeRedDialog();
        dialogFragment.show(getSupportFragmentManager(), "example");
    }

    public void openDialogMetodoPago() {
        AñadirMetodoDialog exampleDialog = new AñadirMetodoDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }

    public void lanzaShowCaseView(View view){

        View btc_ays = findViewById(R.id.btc_ays);
        View favoritos_ays = findViewById(R.id.boton_favoritos_ays);

        Animation animation = new AlphaAnimation(0.0f,1.0f);
        animation.setDuration(250);

        final FancyShowCaseView fancyShowCaseView1 = new FancyShowCaseView.Builder(this)
                .title("Al clickar aqui podemos ver la informacion de la criptomoneda.")
                .titleStyle(R.style.showcaseText, Gravity.CENTER | Gravity.CENTER)
                .backgroundColor(R.color.showCaseBackground)
                .focusBorderColor(Color.BLUE)
                .focusBorderSize(5)
                .focusOn(btc_ays)
                .build();
        final FancyShowCaseView fancyShowCaseView2 = new FancyShowCaseView.Builder(this)
                .title("Aqui podemos ver las criptomonedas favoritas.")
                .titleStyle(R.style.showcaseText, Gravity.CENTER | Gravity.CENTER)
                .backgroundColor(R.color.showCaseBackground)
                .focusBorderColor(Color.BLUE)
                .focusBorderSize(5)
                .focusOn(favoritos_ays)
                .build();

        FancyShowCaseQueue mQueue = new FancyShowCaseQueue()
                .add(fancyShowCaseView1)
                .add(fancyShowCaseView2);
        mQueue.show();
    }
}