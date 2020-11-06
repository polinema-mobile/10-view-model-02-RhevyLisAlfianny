package id.putraprima.mvvmlogin.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.LoginUser;

public class HomeViewModels extends ViewModel {
    private MutableLiveData<LoginUser> homeMutableLiveData = new MutableLiveData<>();
    private LoginUser loginUser;

    public HomeViewModels(LoginUser loginUser){
        this.loginUser = loginUser;
        this.homeMutableLiveData.setValue(loginUser);
    }
    public LiveData<LoginUser> modelLoginLiveData(){
        return homeMutableLiveData;
    }
}
