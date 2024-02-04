package ec.edu.utpl.computacion.pfr.pi

import monix.execution.Scheduler.Implicits.global
import monix.reactive.Observable


object EjemploProgramacionReactiva {
  @main
  def cuadradoNums() ={
  val numerosObservable: Observable[Int] = Observable(1, 2, 3, 4, 5)

  val cuadradosObservable: Observable[Int] = numerosObservable.map(num => num * num)

  val suscripcion = cuadradosObservable.subscribe
    {
      cuadrado =>
    println("Cuadrado: ",
      cuadrado)
    }
  suscripcion.cancel()
}
}