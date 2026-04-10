package com.facturafacil.app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.facturafacil.app.databinding.FragmentActionsBinding

class ActionsFragment : Fragment() {

    private var _binding: FragmentActionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentActionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.registerButton.setOnClickListener {
            val factura = binding.invoiceNameInput.text.toString().ifBlank { "Factura sin nombre" }
            binding.resultText.text = "Factura \"$factura\" registrada correctamente."
            Toast.makeText(requireContext(), "Registro simulado", Toast.LENGTH_SHORT).show()
        }

        binding.paidButton.setOnClickListener {
            binding.resultText.text = "La factura fue marcada como pagada."
        }

        binding.dueButton.setOnClickListener {
            binding.resultText.text = "Próximos vencimientos: Energía 18/04, Internet 21/04, Agua 25/04."
        }

        binding.clearButton.setOnClickListener {
            binding.invoiceNameInput.text?.clear()
            binding.amountInput.text?.clear()
            binding.resultText.text = "Campos limpiados."
        }

        binding.alertButton.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("Recordatorio")
                .setMessage("Tienes 3 facturas próximas a vencer esta semana.")
                .setPositiveButton("Entendido", null)
                .show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
