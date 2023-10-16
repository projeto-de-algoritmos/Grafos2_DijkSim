package projeto.controle.grafos2_dijksim

import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import projeto.controle.grafos2_dijksim.databinding.ActivityMainBinding
import projeto.controle.grafos2_dijksim.databinding.TelaInicialBinding
import java.util.PriorityQueue

class MainActivity : AppCompatActivity() {

    private lateinit var bindingInicio: TelaInicialBinding
    private lateinit var bindingMain: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window?.statusBarColor = ContextCompat.getColor(this, R.color.black)
        }

        var qtdCliques = 0

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
            bindingMain.info.isVisible = true
        }
        bindingMain.buttonFecharInfo.setOnClickListener {
            bindingMain.info.isVisible = false
        }

        bindingMain.buttonA.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(0)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 0
            }
        }
        bindingMain.buttonB.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(1)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 1
            }
        }
        bindingMain.buttonC.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(2)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 2
            }
        }
        bindingMain.buttonD.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(3)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 3
            }
        }
        bindingMain.buttonE.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(4)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 4
            }
        }
        bindingMain.buttonF.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(5)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 5
            }
        }
        bindingMain.buttonG.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(6)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 6
            }
        }
        bindingMain.buttonH.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(7)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 7
            }
        }
        bindingMain.buttonI.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(8)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 8
            }
        }
        bindingMain.buttonJ.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(9)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 9
            }
        }
        bindingMain.buttonK.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(10)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 10
            }
        }
        bindingMain.buttonL.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(11)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 11
            }
        }
        bindingMain.buttonM.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(12)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 12
            }
        }
        bindingMain.buttonN.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(13)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 13
            }
        }
        bindingMain.buttonO.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(14)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 14
            }
        }
        bindingMain.buttonP.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(15)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 15
            }
        }
        bindingMain.buttonQ.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(16)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 16
            }
        }
        bindingMain.buttonR.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(17)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 17
            }
        }
        bindingMain.buttonS.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(18)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 18
            }
        }
        bindingMain.buttonT.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(19)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 19
            }
        }
        bindingMain.buttonU.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(20)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 20
            }
        }
        bindingMain.buttonV.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(21)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 21
            }
        }
        bindingMain.buttonW.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(22)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 22
            }
        }
        bindingMain.buttonX.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(23)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 23
            }
        }
        bindingMain.buttonY.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(24)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 24
            }
        }
        bindingMain.buttonZ.setOnClickListener {
            qtdCliques++
            if (qtdCliques == 1) {
                bindingMain.buttonProximo.isVisible = true
                criaGrafo(25)
            } else {
                mudaEstadoDosBotoes(false)
                val destino = 25
            }
        }
    }
    data class Edge(val to: Int, val cost: Int) : Comparable<Edge> {
        override fun compareTo(other: Edge) = cost - other.cost
    }

    fun dijkstra(graph: List<List<Edge>>, start: Int): IntArray {
        val pq = PriorityQueue<Edge>()
        val dist = IntArray(graph.size) { Int.MAX_VALUE }
        dist[start] = 0
        pq.add(Edge(start, 0))

        while (pq.isNotEmpty()) {
            val cur = pq.poll()
            if (cur.cost > dist[cur.to]) continue

            for (edge in graph[cur.to]) {
                val nextDist = dist[cur.to] + edge.cost
                if (nextDist < dist[edge.to]) {
                    dist[edge.to] = nextDist
                    pq.add(Edge(edge.to, nextDist))
                }
            }
        }

        return dist
    }
/*
    fun verificaVisinhos(graph: List<List<Edge>>) {

    }*/
    fun criaGrafo(primeiroVertice: Int) {
        val graph = listOf(
            listOf(Edge(1, 3)),                 // arestas do vértice A
            listOf(Edge(0, 3), Edge(4, 6), Edge(5, 4), Edge(7, 27)), // arestas do vértice B
            listOf(Edge(4, 5), Edge(6, 10)),        // arestas do vértice C
            listOf(Edge(6, 12)),
            listOf(Edge(1, 6), Edge(2, 5), Edge(6, 7)),
            listOf(Edge(1, 4), Edge(9, 4)),
            listOf(Edge(2, 10), Edge(3, 12), Edge(4, 7), Edge(8, 3), Edge(11, 20)),
            listOf(Edge(1, 27), Edge(9, 12), Edge(11, 6)),
            listOf(Edge(6, 3), Edge(11, 18)),
            listOf(Edge(5, 4), Edge(7, 12), Edge(13, 10)),
            listOf(Edge(13, 15), Edge(14, 9)),
            listOf(Edge(6, 20), Edge(7, 6), Edge(8, 18), Edge(12, 5), Edge(13, 8)),
            listOf(Edge(11, 5), Edge(13, 12), Edge(14, 17), Edge(15, 2)),
            listOf(Edge(9, 10), Edge(10, 15), Edge(11, 8), Edge(12, 12), Edge(14, 5)),
            listOf(Edge(10, 9), Edge(12, 17), Edge(13, 5), Edge(17, 1), Edge(18, 5)),
            listOf(Edge(12, 2), Edge(19, 7)),
            listOf(Edge(18, 8), Edge(19, 19)),
            listOf(Edge(14, 1), Edge(18, 4)),
            listOf(Edge(14, 5), Edge(16, 8), Edge(17, 4), Edge(19, 12), Edge(21, 9), Edge(22, 4), Edge(25, 15)),
            listOf(Edge(12, 6), Edge(15, 7), Edge(16, 19), Edge(18, 12), Edge(20, 4)),
            listOf(Edge(19, 4), Edge(22, 2), Edge(23, 6), Edge(24, 3)),
            listOf(Edge(18, 9), Edge(25, 9)),
            listOf(Edge(18, 4), Edge(20, 2), Edge(24, 1)),
            listOf(Edge(20, 6), Edge(24, 2)),           // arestas do vértice X
            listOf(Edge(20, 3), Edge(22, 1), Edge(23, 2)),  // arestas do vértice Y
            listOf(Edge(18, 15), Edge(21, 9))           // arestas do vértice Z
        )

        val dist = dijkstra(graph, primeiroVertice)
        /*
        bindingMain.buttonProximo.setOnClickListener {
            verificaVisinhos(graph)
        }*/
        //println(dist.joinToString(", ")) // prints: 0, 2, 4, 5, 8
        bindingMain.textViewCaminho.text = dist.joinToString(", ")
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