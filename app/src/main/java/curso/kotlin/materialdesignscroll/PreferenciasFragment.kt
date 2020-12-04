package curso.kotlin.materialdesignscroll

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class PreferenciasFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?,
                                     rootKey: String?) {
        setPreferencesFromResource(R.xml.preferencias, rootKey)
    }
}