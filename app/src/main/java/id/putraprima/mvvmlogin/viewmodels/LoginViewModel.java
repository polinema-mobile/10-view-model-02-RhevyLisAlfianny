package id.putraprima.mvvmlogin.viewmodels;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.LoginUser;

public class LoginViewModel extends ViewModel {

    private MutableLiveData<LoginUser> loginMutableLiveData = new MutableLiveData<>();
    private LoginUser loginUser;

    public String email, password;

    public  LoginViewModel (LoginUser loginUser)
    {
        this.loginUser = loginUser;
        this.loginMutableLiveData.setValue(this.loginUser);
    }

    public boolean isLogin(){

        if(email.equals(loginUser.getStrEmailAddress()) && password.equals(loginUser.getStrPassword())){
            return true;
        }else{
            return false;
        }
    }
    public LiveData<LoginUser> modelLoginLiveData(){
        return loginMutableLiveData;
    }
}
