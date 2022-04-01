package com.lee989898.todayeat.src.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lee989898.todayeat.MainActivity
import com.lee989898.todayeat.databinding.ActivityLoginBinding
import com.lee989898.todayeat.src.join.JoinNicknameActivity

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginNoLoginIv.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.loginKakaoLoginIv.setOnClickListener {
            startActivity(Intent(this, JoinNicknameActivity::class.java))
        }
    }
}