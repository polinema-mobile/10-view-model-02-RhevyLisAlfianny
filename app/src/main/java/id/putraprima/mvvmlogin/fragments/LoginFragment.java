package id.putraprima.mvvmlogin.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;
//import androidx.lifecycle.ViewModelProviders;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

import id.putraprima.mvvmlogin.R;
import id.putraprima.mvvmlogin.databinding.FragmentLoginBinding;
import id.putraprima.mvvmlogin.databinding.FragmentSplashBinding;
import id.putraprima.mvvmlogin.models.LoginUser;
import id.putraprima.mvvmlogin.viewmodels.LoginViewModel;
import id.putraprima.mvvmlogin.viewmodels.LoginViewModelFactory;

public class LoginFragment extends Fragment {
    private LoginViewModel loginViewModel;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_login, container, false);
        FragmentLoginBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
        LoginViewModelFactory loginViewModelFactory = new LoginViewModelFactory(new LoginUser("rhevy@mail.com","123456"));
        loginViewModel =  new ViewModelProvider(this, loginViewModelFactory).get(LoginViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setLoginViewModel(loginViewModel);

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (loginViewModel.isLogin()) {
                    Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_homeFragment);
                } else {
                    binding.editTextEmail.setError("Username harus sesuai");
                    binding.editTextPassword.setError("Password harus sesuai");
                }
            }
        });
        return binding.getRoot();
    }
}