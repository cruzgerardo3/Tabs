package net.lrivas.tabs

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class QuienSoyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_quien_soy, container, false)

        // Configurar información personal
        view.findViewById<TextView>(R.id.tvNombre).text = "Nombre: Cruz Gerardo"
        view.findViewById<TextView>(R.id.tvApellido).text = "Apellido: Amaya Rivera"
        view.findViewById<TextView>(R.id.tvCarnet).text = "Carnet: U20221325"
        view.findViewById<TextView>(R.id.tvTelefono).text = "Teléfono: +50374780996"

        // Botón para enviar mensaje vía WhatsApp
        view.findViewById<Button>(R.id.btnEscribeme).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://wa.me/+50374780996")
            startActivity(intent)
        }
        return view
    }
}
