package fr.sio.ecp.federatedbirds.app;


import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract class AbstractTaskFragment extends DialogFragment {

    protected static final String ARG_LOGIN = "login";
    protected static final String ARG_PASSWORD = "password";
    protected static final String ARG_EMAIL = "email";

    public abstract void setArguments(String login, String password, String email);

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @NonNull
    @Override
    public  abstract Dialog onCreateDialog(Bundle savedInstanceState);

}
