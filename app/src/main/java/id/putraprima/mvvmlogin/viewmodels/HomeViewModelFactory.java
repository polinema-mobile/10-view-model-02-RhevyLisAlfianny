package id.putraprima.mvvmlogin.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import id.putraprima.mvvmlogin.models.LoginUser;

public class HomeViewModelFactory implements ViewModelProvider.Factory {
    private LoginUser loginUser;

    public HomeViewModelFactory(LoginUser loginUser){
        this.loginUser = loginUser;

    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(LoginViewModel.class)){
            return (T) new HomeViewModels(loginUser);
        }
        throw new IllegalArgumentException("ViewModel ViewModelHome");
    }
}
