package com.openclassrooms.magicgithub.base;

import com.openclassrooms.magicgithub.MagicGithubApplication;
import com.openclassrooms.magicgithub.repository.UserRepository;

import androidx.appcompat.app.AppCompatActivity;

/**
 * the class BaseActivity is a daughter class of AppCompatActivity,
 * it extends AppCompatActivity, it inherits of all the variables of AppCompatActivity
 * AppCompatActivity will have it own variables
 */
public abstract class BaseActivity extends AppCompatActivity {

    public UserRepository getUserRepository() {
        return ((MagicGithubApplication) getApplication()).getUserRepository();
    }
}
