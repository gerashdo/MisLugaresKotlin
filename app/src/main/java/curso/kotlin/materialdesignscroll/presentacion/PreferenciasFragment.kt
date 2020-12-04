package curso.kotlin.materialdesignscroll.presentacion

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import curso.kotlin.materialdesignscroll.R

class PreferenciasFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?,
                                     rootKey: String?) {
        setPreferencesFromResource(R.xml.preferencias, rootKey)
    }
}