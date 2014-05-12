package net.ut11.ccmp.example.fragment;

import android.os.Bundle;
import android.support.v4.preference.PreferenceFragment;

import net.ut11.ccmp.example.R;

public class SettingsFragment extends PreferenceFragment {

	@Override
	public void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		addPreferencesFromResource(R.xml.preferences);
	}
}
