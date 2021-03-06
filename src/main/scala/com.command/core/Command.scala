package com.command.core

import cats.data.Reader
import play.api.mvc.Result

import scala.concurrent.Future

trait Command {

  def execute: Reader[DependencyBase, Future[Result]]

}
