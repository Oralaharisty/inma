SharedPreferences preferences = getSharedPreferences("your_preference_name", Context.MODE_PRIVATE);
SharedPreferences.Editor editor = preferences.edit();
editor.clear();
editor.apply();
