package com.busraornek.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.busraornek.loginpage.databinding.ActivityMainBinding
import com.busraornek.loginpage.databinding.ActivityRegisterBinding
import com.google.android.material.snackbar.Snackbar

class RegisterActivity : AppCompatActivity() {
    private lateinit var bindingg: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingg = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(bindingg.root)

        val editTextAd = bindingg.editTextName

        val editTextEmail = bindingg.editTextEmailAddresss
        val editTextPasword = bindingg.editTextNumberPassword

        bindingg.buttonSingUp2.setOnClickListener {
            if (editTextAd.text.isEmpty() || editTextEmail.text.isEmpty() || editTextPasword.text.isEmpty()) {
                if(editTextAd.text.isEmpty()){
                    bindingg.editTextName.error = "getString(R.string.error)"
                    Snackbar.make(it, "Gerekli alanları doldurunuz,", Snackbar.LENGTH_SHORT).show()

                }
                if (editTextEmail.text.isEmpty()){
                    bindingg.editTextEmailAddresss.error = "getString(R.string.error)"
                    Snackbar.make(it, "Gerekli alanları doldurunuz,", Snackbar.LENGTH_SHORT).show()

                }
                if (editTextPasword.text.isEmpty()){
                    bindingg.editTextNumberPassword.error = "getString(R.string.error)"
                    Snackbar.make(it, "Gerekli alanları doldurunuz,", Snackbar.LENGTH_SHORT).show()

                }
            } else {
                val yeniIntent = Intent(this@RegisterActivity, HomeActivity::class.java)
                startActivity(yeniIntent)

            }

        }
    }
}