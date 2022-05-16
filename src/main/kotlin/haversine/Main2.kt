package haversine

import DijkstraAlgorithm
import org.json.JSONObject
import java.io.File

fun main() {
    val file = File("src/main/resources/plara.json").readText(Charsets.UTF_8)
    val jsonObject = JSONObject(file)

    val userNode = Node(-6.989892086220185, 106.54376659976543)

    val dijkstraAlgorithm = DijkstraAlgorithm.Builder(jsonObject)
        .setStartOrigin("v1")
        .setEndDestination("v8")
        .setUserNode(userNode)
        .create()

    println("shortest path : ${dijkstraAlgorithm.shortestPath}")
    println("weights : ${dijkstraAlgorithm.weights}")
    println("nodes : ${dijkstraAlgorithm.nodes}")
    println("routes : ${dijkstraAlgorithm.routes}")
}