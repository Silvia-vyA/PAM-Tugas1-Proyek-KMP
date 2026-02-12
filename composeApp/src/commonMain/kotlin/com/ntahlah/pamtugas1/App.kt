package com.ntahlah.pamtugas1

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun App() {

    var showCita by remember { mutableStateOf(false) }
    var showSelamat by remember { mutableStateOf(false) }

    val gradientBlue = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF1E3A8A),  // biru tua
            Color(0xFF2563EB)   // biru cerah
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(gradientBlue)
            .safeContentPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // ===== Nama =====
        Text(
            text = "Halo, Silvia 👑",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(Modifier.height(6.dp))

        Text(
            text = "NIM: 123140133",
            color = Color.White.copy(alpha = 0.85f),
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(Modifier.height(40.dp))

        // ===== Tombol kecil Cita² =====
        Button(
            onClick = { showCita = !showCita },
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            ),
            modifier = Modifier.height(40.dp)
        ) {
            Text(
                text = if (showCita) "Tutup Cita²" else "Cita²",
                color = Color(0xFF1E3A8A)
            )
        }

        Spacer(Modifier.height(16.dp))

        AnimatedVisibility(showCita) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Text(
                    text = "Prof. Dr. Hj. Silvia, S.Kom., M.T.",
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(Modifier.height(4.dp))

                Text(
                    text = "Founder & CEO PT HijabTech Nusantara ✨",
                    color = Color.White.copy(alpha = 0.9f)
                )

                Spacer(Modifier.height(4.dp))

                Text(
                    text = "Teknologi pintar + busana muslim elegan berkelas dunia 🌍",
                    color = Color.White.copy(alpha = 0.8f)
                )

                Spacer(Modifier.height(6.dp))

                Text(
                    text = "Cita-cita: jadi CEO dermawan & sukses 💙",
                    color = Color.White,
                    fontWeight = FontWeight.Medium
                )
            }
        }

        Spacer(Modifier.height(30.dp))

        // ===== Tombol besar Selamat =====
        Button(
            onClick = { showSelamat = !showSelamat },
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .height(50.dp)
        ) {
            Text(
                text = if (showSelamat) "Sembunyikan" else "Klik!",
                color = Color(0xFF1E3A8A),
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(Modifier.height(16.dp))

        AnimatedVisibility(showSelamat) {
            Text(
                text = "Selamat! Kamu resmi menjadi CEO yang DERMAWAN termuda se-Asia Tenggara 💙🚀",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
