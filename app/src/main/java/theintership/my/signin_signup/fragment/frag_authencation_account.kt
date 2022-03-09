package theintership.my.signin_signup.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.Fragment
import theintership.my.R
import theintership.my.databinding.FragAuthencationAccountBinding
import theintership.my.signin_signup.Signup1Activity


class frag_authencation_account : Fragment(R.layout.frag_authencation_account) {

    private var _binding: FragAuthencationAccountBinding? = null
    private val binding get() = _binding!!
    private lateinit var signup1activity: Signup1Activity

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragAuthencationAccountBinding.inflate(inflater, container, false)
        signup1activity = activity as Signup1Activity





        return binding.root
    }

}