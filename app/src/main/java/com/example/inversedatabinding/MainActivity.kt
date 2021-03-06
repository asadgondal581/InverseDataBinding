package com.example.inversedatabinding
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.inversedatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        title = "User Registration Form"
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.handler = this
        binding.viewModel = viewModel

    }

    fun runCode(v: View) {
        /*this is just a demo application for learning purposes
        that's why there is no validation on any input widgets/views
        use validation when developing production application
        */

        //region User Form Input Code

        /*
        this code is not required because all of this
        work is now done by data binding
         */

//        val email = binding.etEmail.text.toString()
//        val username = binding.etUsername.text.toString()
//        val gender =
//                if (binding.rgGender.checkedRadioButtonId == R.id.rb_male) Gender.MALE else Gender.FEMALE

//        var selectedCity: Cities = Cities.ISLAMABAD
//
//        for (city in Cities.values()) {
//            if (binding.spinnerCity.selectedItemPosition == city.ordinal)
//                selectedCity = city
//        }

//        viewModel.user.email = email
//        viewModel.user.username = username
//        viewModel.user.gender = gender
//        viewModel.user.city = selectedCity

        //endregion

        Toast.makeText(this, "Hello, ${viewModel.user.username}", Toast.LENGTH_SHORT).show()

    }
}