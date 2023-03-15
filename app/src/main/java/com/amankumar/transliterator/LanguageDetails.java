package com.amankumar.transliterator;

import android.graphics.drawable.Drawable;

import com.amankumar.transliterator.MainActivity;

public class LanguageDetails extends MainActivity {

    public CharSequence language;
    public CharSequence transliterated;


    public LanguageDetails(){

    }

    public LanguageDetails(CharSequence language, CharSequence transliterated) {
        this.language = language;
        this.transliterated = transliterated;
    }


    public CharSequence getLanguage() {
        return language;
    }

    public void setLanguage(CharSequence language) {
        this.language = language;
    }

    public CharSequence getTransliterated() {
        return transliterated;
    }

    public void setTransliterated(CharSequence transliterated) {
        this.transliterated = transliterated;
    }
}
