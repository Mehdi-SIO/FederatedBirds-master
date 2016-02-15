package fr.sio.ecp.federatedbirds.app;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import fr.sio.ecp.federatedbirds.R;
import fr.sio.ecp.federatedbirds.utils.ValidationUtils;

public class CreateAccountFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.create_account, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getView().findViewById(R.id.create).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });

    }

    private void signUp(){
        // Get form views
        EditText usernameText = (EditText) getView().findViewById(R.id.username);
        EditText passwordText = (EditText) getView().findViewById(R.id.password);
        EditText emailText = (EditText) getView().findViewById(R.id.email);

        String login = usernameText.getText().toString();
        String password = passwordText.getText().toString();
        String email = emailText.getText().toString();

        if (!ValidationUtils.validateLogin(login)) {
            usernameText.setError("Format invalide");
            usernameText.requestFocus();
            return;
        }

        if (!ValidationUtils.validatePassword(password)) {
            passwordText.setError("Format invalide");
            passwordText.requestFocus();
            return;
        }


        LoginTaskFragment taskFragment = new CreateAccountTaskFragment();
        taskFragment.setArguments(login, password, email);
        taskFragment.show(getFragmentManager(), "login_task");
    }

}



