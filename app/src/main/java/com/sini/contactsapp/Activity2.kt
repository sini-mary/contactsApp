package com.sini.contactsapp

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sini.contactsapp.databinding.ActivityMainBinding


    class AddContacts : AppCompatActivity() {

        lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            val btnadd = findViewById<Button>(R.id.btnadd)
            btnadd.setOnClickListener {
                val intent = Intent(this@AddContacts, MainActivity::class.java)
                startActivity(intent)
            }
            onResume()
        }
        override fun onResume() {
            super.onResume()
               checkError()
              validateContacts()
            }



fun checkError() {

    binding.root

    binding.etFirstname.addTextChangedListener(object : TextWatcher {

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            binding.tilfirstName.error = null
        }

        override fun afterTextChanged(s: Editable?) {

        }
    })

    binding.tillastName.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            val binding
            binding.tillastName.error = null
        }

        override fun afterTextChanged(s: Editable?) {

        }
    })
    binding.etPhoneNumber.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            binding.tilphoneNumber.error = null
        }

        override fun afterTextChanged(s: Editable?) {

        }
    })
    binding.etEmail.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            binding.tilEmail.error = null
        }

        override fun afterTextChanged(s: Editable?) {

        }
    })
}
fun validateContacts(){
    val name =binding. etFirstName.text.toString()
    val contacts = binding.etLastName.text.toString()

    val email =binding. etEmail.text.toString()

    var error = false
    if (name.isBlank()){
        binding. tilfirstName.error = "name is required"
        error = true
    }

    if (name.isBlank()){
        binding. tieSecondName.error = "name is required"
        error = true
    }

    if (contacts.isBlank()){
        binding.tilPhoneNumber.error = "contacts is required"
        error = true
    }

    if (email.isBlank()){
        binding.tilEmail.error = "Email is required"
        error = true
    }


    if (!error){
        Toast.makeText(this,"$name,$contacts, $email", Toast.LENGTH_LONG).show()
    }

}}









