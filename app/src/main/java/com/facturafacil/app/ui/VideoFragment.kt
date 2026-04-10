package com.facturafacil.app.ui

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import androidx.fragment.app.Fragment
import com.facturafacil.app.databinding.FragmentVideoBinding

class VideoFragment : Fragment() {

    private var _binding: FragmentVideoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVideoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val videoUri = Uri.parse("https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4")
        val mediaController = MediaController(requireContext())
        mediaController.setAnchorView(binding.videoView)

        binding.videoView.setMediaController(mediaController)
        binding.videoView.setVideoURI(videoUri)
        binding.videoView.setOnPreparedListener { player: MediaPlayer ->
            player.isLooping = false
            binding.videoStatus.text = "Video listo para reproducirse."
        }
        binding.videoView.setOnCompletionListener {
            binding.videoStatus.text = "Video finalizado."
        }

        binding.playButton.setOnClickListener {
            binding.videoView.start()
            binding.videoStatus.text = "Reproduciendo guía de registro de facturas."
        }

        binding.pauseButton.setOnClickListener {
            if (binding.videoView.isPlaying) {
                binding.videoView.pause()
                binding.videoStatus.text = "Video en pausa."
            }
        }

        binding.restartButton.setOnClickListener {
            binding.videoView.seekTo(0)
            binding.videoView.start()
            binding.videoStatus.text = "Video reiniciado."
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
