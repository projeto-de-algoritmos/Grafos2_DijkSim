package projeto.controle.grafos2_dijksim

import android.content.pm.ActivityInfo
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import projeto.controle.grafos2_dijksim.databinding.ActivityMainBinding
import projeto.controle.grafos2_dijksim.databinding.TelaInicialBinding
import java.util.PriorityQueue

class MainActivity : AppCompatActivity() {

    private lateinit var bindingInicio: TelaInicialBinding
    private lateinit var bindingMain: ActivityMainBinding
    private var noDeDestino: Char = ' '

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window?.statusBarColor = ContextCompat.getColor(this, R.color.marrom)
        }

        var qtdCliques = 0
        var noDeInicio = ' '

        bindingInicio = TelaInicialBinding.inflate(layoutInflater)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingInicio.root)

        bindingInicio.buttonIniciar.setOnClickListener {
            setContentView(bindingMain.root)
        }
        bindingMain.buttonVoltar.setOnClickListener {
            setContentView(bindingInicio.root)
        }
        bindingMain.buttonInfo.setOnClickListener {
            bindingMain.telaInfo.isVisible = true
        }
        bindingMain.buttonFecharInfo.setOnClickListener {
            bindingMain.telaInfo.isVisible = false
        }

        bindingMain.buttonA.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'A'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'A'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonA.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonB.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'B'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'B'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonB.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonC.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'C'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'C'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonC.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonD.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'D'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'D'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonD.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonE.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'E'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'E'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonE.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonF.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'F'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'F'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonF.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonG.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'G'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'G'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonG.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonH.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'H'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'H'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonH.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonI.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'I'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'I'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonI.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonJ.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'J'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'J'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonJ.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonK.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'K'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'K'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonK.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonL.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'L'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'L'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonL.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonM.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'M'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'M'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonM.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonN.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'N'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'N'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonN.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonO.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'O'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'O'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonO.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonP.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'P'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'P'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonP.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonQ.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'Q'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'Q'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonQ.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonR.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'R'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'R'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonR.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonS.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'S'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'S'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonS.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonT.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'T'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'T'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonT.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonU.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'U'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'U'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonU.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonV.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'V'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'V'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonV.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonW.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'W'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'W'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonW.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonX.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'X'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'X'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonX.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonY.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'Y'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'Y'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonY.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
        bindingMain.buttonZ.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                noDeInicio = 'Z'
                bindingMain.textViewFila.text = "Escolha um nó de destino"
                criaGrafo(noDeInicio)
            } else {
                noDeDestino = 'Z'
                bindingMain.textViewFila.text = "Iniciando trajeto de " + noDeInicio + " para " + noDeDestino
                bindingMain.buttonZ.setBackgroundColor(ContextCompat.getColor(this, R.color.laranja))
                bindingMain.buttonProximo.isVisible = true
                mudaEstadoDosBotoes(false)
            }
        }
    }
    data class Edge(var to: Char, val cost: Int, var from: Char) : Comparable<Edge> {
        override fun compareTo(other: Edge) = cost - other.cost
    }

    fun dijkstra(graph: List<List<Edge>>, start: Char) {
        val pq = PriorityQueue<Edge>()
        val dist = IntArray(graph.size) { Int.MAX_VALUE }
        val set = CharArray(26)

        dist[start.code-65] = 0
        pq.add(Edge(start, 0, start))

        when (start) {
            'A' -> bindingMain.buttonA.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'B' -> bindingMain.buttonB.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'C' -> bindingMain.buttonC.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'D' -> bindingMain.buttonD.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'E' -> bindingMain.buttonE.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'F' -> bindingMain.buttonF.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'G' -> bindingMain.buttonG.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'H' -> bindingMain.buttonH.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'I' -> bindingMain.buttonI.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'J' -> bindingMain.buttonJ.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'K' -> bindingMain.buttonK.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'L' -> bindingMain.buttonL.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'M' -> bindingMain.buttonM.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'N' -> bindingMain.buttonN.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'O' -> bindingMain.buttonO.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'P' -> bindingMain.buttonP.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'Q' -> bindingMain.buttonQ.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'R' -> bindingMain.buttonR.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'S' -> bindingMain.buttonS.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'T' -> bindingMain.buttonT.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'U' -> bindingMain.buttonU.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'V' -> bindingMain.buttonV.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'W' -> bindingMain.buttonW.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'X' -> bindingMain.buttonX.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'Y' -> bindingMain.buttonY.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
            'Z' -> bindingMain.buttonZ.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
        }

        var atual = Edge(' ', 0, ' ')
        bindingMain.buttonProximo.setOnClickListener {
            if (pq.isNotEmpty() && atual.to != noDeDestino) {
                atual = pq.poll()
                set[atual.to.code-65] = atual.from
                if (atual.cost > dist[atual.to.code-65]) {
                    // Pintar as arestas não utilizadas
                } else {
                    for (edge in graph[atual.to.code-65]) {
                        val nextDist = dist[atual.to.code-65] + edge.cost
                        if (nextDist < dist[edge.to.code-65]) {
                            dist[edge.to.code-65] = nextDist
                            pq.add(Edge(edge.to, nextDist, atual.to))
                            when (edge.to) {
                                'A' -> bindingMain.buttonA.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'B' -> bindingMain.buttonB.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'C' -> bindingMain.buttonC.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'D' -> bindingMain.buttonD.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'E' -> bindingMain.buttonE.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'F' -> bindingMain.buttonF.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'G' -> bindingMain.buttonG.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'H' -> bindingMain.buttonH.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'I' -> bindingMain.buttonI.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'J' -> bindingMain.buttonJ.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'K' -> bindingMain.buttonK.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'L' -> bindingMain.buttonL.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'M' -> bindingMain.buttonM.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'N' -> bindingMain.buttonN.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'O' -> bindingMain.buttonO.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'P' -> bindingMain.buttonP.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'Q' -> bindingMain.buttonQ.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'R' -> bindingMain.buttonR.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'S' -> bindingMain.buttonS.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'T' -> bindingMain.buttonT.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'U' -> bindingMain.buttonU.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'V' -> bindingMain.buttonV.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'W' -> bindingMain.buttonW.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'X' -> bindingMain.buttonX.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'Y' -> bindingMain.buttonY.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                                'Z' -> bindingMain.buttonZ.setBackgroundColor(ContextCompat.getColor(this, R.color.verde))
                            }
                        }
                    }
                }
                bindingMain.textViewFila.text = pq.toString()
                when (atual.to) {
                    'A' -> bindingMain.buttonA.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'B' -> bindingMain.buttonB.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'C' -> bindingMain.buttonC.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'D' -> bindingMain.buttonD.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'E' -> bindingMain.buttonE.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'F' -> bindingMain.buttonF.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'G' -> bindingMain.buttonG.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'H' -> bindingMain.buttonH.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'I' -> bindingMain.buttonI.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'J' -> bindingMain.buttonJ.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'K' -> bindingMain.buttonK.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'L' -> bindingMain.buttonL.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'M' -> bindingMain.buttonM.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'N' -> bindingMain.buttonN.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'O' -> bindingMain.buttonO.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'P' -> bindingMain.buttonP.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'Q' -> bindingMain.buttonQ.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'R' -> bindingMain.buttonR.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'S' -> bindingMain.buttonS.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'T' -> bindingMain.buttonT.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'U' -> bindingMain.buttonU.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'V' -> bindingMain.buttonV.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'W' -> bindingMain.buttonW.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'X' -> bindingMain.buttonX.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'Y' -> bindingMain.buttonY.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                    'Z' -> bindingMain.buttonZ.setBackgroundColor(ContextCompat.getColor(this, R.color.vermelho))
                }
            } else {
                var aux = atual
                var soma = 0
                bindingMain.buttonProximo.isVisible = false
                while (aux.to != start) {
                    soma = soma + aux.cost
                    when (aux.to) {
                         'A' -> bindingMain.buttonA.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'B' -> bindingMain.buttonB.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'C' -> bindingMain.buttonC.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'D' -> bindingMain.buttonD.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'E' -> bindingMain.buttonE.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'F' -> bindingMain.buttonF.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'G' -> bindingMain.buttonG.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'H' -> bindingMain.buttonH.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'I' -> bindingMain.buttonI.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'J' -> bindingMain.buttonJ.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'K' -> bindingMain.buttonK.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'L' -> bindingMain.buttonL.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'M' -> bindingMain.buttonM.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'N' -> bindingMain.buttonN.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'O' -> bindingMain.buttonO.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'P' -> bindingMain.buttonP.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'Q' -> bindingMain.buttonQ.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'R' -> bindingMain.buttonR.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'S' -> bindingMain.buttonS.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'T' -> bindingMain.buttonT.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'U' -> bindingMain.buttonU.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'V' -> bindingMain.buttonV.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'W' -> bindingMain.buttonW.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'X' -> bindingMain.buttonX.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'Y' -> bindingMain.buttonY.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                         'Z' -> bindingMain.buttonZ.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                     }
                     aux.to = set[aux.to.code-65]
                }
                when (start) {
                    'A' -> bindingMain.buttonA.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'B' -> bindingMain.buttonB.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'C' -> bindingMain.buttonC.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'D' -> bindingMain.buttonD.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'E' -> bindingMain.buttonE.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'F' -> bindingMain.buttonF.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'G' -> bindingMain.buttonG.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'H' -> bindingMain.buttonH.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'I' -> bindingMain.buttonI.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'J' -> bindingMain.buttonJ.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'K' -> bindingMain.buttonK.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'L' -> bindingMain.buttonL.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'M' -> bindingMain.buttonM.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'N' -> bindingMain.buttonN.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'O' -> bindingMain.buttonO.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'P' -> bindingMain.buttonP.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'Q' -> bindingMain.buttonQ.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'R' -> bindingMain.buttonR.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'S' -> bindingMain.buttonS.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'T' -> bindingMain.buttonT.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'U' -> bindingMain.buttonU.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'V' -> bindingMain.buttonV.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'W' -> bindingMain.buttonW.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'X' -> bindingMain.buttonX.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'Y' -> bindingMain.buttonY.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                    'Z' -> bindingMain.buttonZ.setBackgroundColor(ContextCompat.getColor(this, R.color.azul))
                }
                bindingMain.textViewFila.text = "A menor distância entre " + start + " e " + noDeDestino + " é " + dist[noDeDestino.code-65]

            }
        }
    }

    fun criaGrafo(primeiroVertice: Char) {
        val graph = listOf(
            listOf(Edge('B', 3, ' ')),                 // arestas do vértice A
            listOf(Edge('A', 3, ' '), Edge('E', 6, ' '), Edge('F', 4, ' '), Edge('H', 27, ' ')), // arestas do vértice B
            listOf(Edge('E', 5, ' '), Edge('G', 10, ' ')),        // arestas do vértice C
            listOf(Edge('G', 12, ' ')),
            listOf(Edge('B', 6, ' '), Edge('C', 5, ' '), Edge('G', 7, ' ')),
            listOf(Edge('B', 4, ' '), Edge('J', 4, ' ')),
            listOf(Edge('C', 10, ' '), Edge('D', 12, ' '), Edge('E', 7, ' '), Edge('I', 3, ' '), Edge('L', 20, ' ')),
            listOf(Edge('B', 27, ' '), Edge('J', 12, ' '), Edge('L', 6, ' ')),
            listOf(Edge('G', 3, ' '), Edge('L', 18, ' ')),
            listOf(Edge('F', 4, ' '), Edge('H', 12, ' '), Edge('N', 10, ' ')),
            listOf(Edge('N', 15, ' '), Edge('O', 9, ' ')),
            listOf(Edge('G', 20, ' '), Edge('H', 6, ' '), Edge('I', 18, ' '), Edge('M', 5, ' '), Edge('N', 8, ' ')),
            listOf(Edge('L', 5, ' '), Edge('N', 12, ' '), Edge('O', 17, ' '), Edge('P', 2, ' ')),
            listOf(Edge('J', 10, ' '), Edge('K', 15, ' '), Edge('L', 8, ' '), Edge('M', 12, ' '), Edge('O', 5, ' ')),
            listOf(Edge('K', 9, ' '), Edge('M', 17, ' '), Edge('N', 5, ' '), Edge('R', 1, ' '), Edge('S', 5, ' ')),
            listOf(Edge('M', 2, ' '), Edge('T', 7, ' ')),
            listOf(Edge('S', 8, ' '), Edge('T', 19, ' ')),
            listOf(Edge('O', 1, ' '), Edge('S', 4, ' ')),
            listOf(Edge('O', 5, ' '), Edge('Q', 8, ' '), Edge('R', 4, ' '), Edge('T', 12, ' '), Edge('V', 9, ' '), Edge('W', 4, ' '), Edge('Z', 15, ' ')),
            listOf(Edge('M', 6, ' '), Edge('P', 7, ' '), Edge('Q', 19, ' '), Edge('S', 12, ' '), Edge('U', 4, ' ')),
            listOf(Edge('T', 4, ' '), Edge('W', 2, ' '), Edge('X', 6, ' '), Edge('Y', 3, ' ')),
            listOf(Edge('S', 9, ' '), Edge('Z', 9, ' ')),
            listOf(Edge('S', 4, ' '), Edge('U', 2, ' '), Edge('Y', 1, ' ')),
            listOf(Edge('U', 6, ' '), Edge('Y', 2, ' ')),           // arestas do vértice X
            listOf(Edge('U', 3, ' '), Edge('W', 1, ' '), Edge('X', 2, ' ')),  // arestas do vértice Y
            listOf(Edge('S', 15, ' '), Edge('V', 9, ' '))           // arestas do vértice Z
        )

        dijkstra(graph, primeiroVertice)
    }

    fun mudaEstadoDosBotoes(estado: Boolean) {
        bindingMain.buttonA.isEnabled = estado
        bindingMain.buttonB.isEnabled = estado
        bindingMain.buttonC.isEnabled = estado
        bindingMain.buttonD.isEnabled = estado
        bindingMain.buttonE.isEnabled = estado
        bindingMain.buttonF.isEnabled = estado
        bindingMain.buttonG.isEnabled = estado
        bindingMain.buttonH.isEnabled = estado
        bindingMain.buttonI.isEnabled = estado
        bindingMain.buttonJ.isEnabled = estado
        bindingMain.buttonK.isEnabled = estado
        bindingMain.buttonL.isEnabled = estado
        bindingMain.buttonM.isEnabled = estado
        bindingMain.buttonN.isEnabled = estado
        bindingMain.buttonO.isEnabled = estado
        bindingMain.buttonP.isEnabled = estado
        bindingMain.buttonQ.isEnabled = estado
        bindingMain.buttonR.isEnabled = estado
        bindingMain.buttonS.isEnabled = estado
        bindingMain.buttonT.isEnabled = estado
        bindingMain.buttonU.isEnabled = estado
        bindingMain.buttonV.isEnabled = estado
        bindingMain.buttonW.isEnabled = estado
        bindingMain.buttonX.isEnabled = estado
        bindingMain.buttonY.isEnabled = estado
        bindingMain.buttonZ.isEnabled = estado
    }
}