package com.jacobhaning.humidor;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jacobhaning.humidor.databinding.ActivityNewCigarConfirmationBinding;
import com.jacobhaning.humidor.model.Cigar;

public class NewCigarConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityNewCigarConfirmationBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_new_cigar_confirmation);
        binding.setCigar((Cigar) getIntent().getSerializableExtra("EXTRA_CIGAR"));
    }

    public void confirmNewCigar(View view) {
    }

    public void cancelConfirmNewCigar(View view) {
    }

    public void editNewCigar(View view) {
    }
}
