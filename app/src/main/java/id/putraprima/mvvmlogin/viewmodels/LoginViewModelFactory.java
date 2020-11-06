package id.putraprima.mvvmlogin.viewmodels;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import id.putraprima.mvvmlogin.models.LoginUser;

public class LoginViewModelFactory implements ViewModelProvider.Factory {
    private final LoginUser loginUser;

    public LoginViewModelFactory(LoginUser loginUser){
        this.loginUser = loginUser;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(LoginViewModel.class)){
            return (T) new LoginViewModel(loginUser);
        }
        throw new IllegalArgumentException("Permintaan ViewModel ViewModelLogin");
    }
}
