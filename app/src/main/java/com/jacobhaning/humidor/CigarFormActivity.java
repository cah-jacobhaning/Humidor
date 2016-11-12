package com.jacobhaning.humidor;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import com.jacobhaning.humidor.databinding.ActivityCigarFormBinding;
import com.jacobhaning.humidor.model.Cigar;

public class CigarFormActivity extends AppCompatActivity {
    private Cigar cigar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cigar = new Cigar();
        ActivityCigarFormBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_cigar_form);
        binding.setCigar(cigar);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void saveNewCigar(View view) {
        Intent intent = new Intent(this, NewCigarConfirmationActivity.class);
        intent.putExtra("EXTRA_CIGAR", cigar);
        startActivity(intent);
    }

    public void cancelNewCigar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
