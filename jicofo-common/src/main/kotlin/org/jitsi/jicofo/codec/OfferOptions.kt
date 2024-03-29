/*
 * Jicofo, the Jitsi Conference Focus.
 *
 * Copyright @ 2015-Present 8x8, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jitsi.jicofo.codec

/**
 * Options for an offer that jicofo generates for a specific participant (or for an Octo link).
 */
data class OfferOptions(
    var audio: Boolean = true,
    var video: Boolean = true,
    var sctp: Boolean = true,
    var stereo: Boolean = true,
    var tcc: Boolean = true,
    var remb: Boolean = false,
    var rtx: Boolean = true,
    var opusRed: Boolean = true,
    var minBitrate: Int? = null,
    var startBitrate: Int? = null,
    var opusMaxAverageBitrate: Int? = null
)
