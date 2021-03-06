package com.command.core

import play.api.libs.json.Reads

trait CommandHelper {

  def name: String

  def commandReads: Reads[Command]

}
