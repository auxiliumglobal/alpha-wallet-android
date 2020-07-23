package com.alphawallet.walletconnect

import com.alphawallet.walletconnect.models.WCPeerMeta
import com.alphawallet.walletconnect.models.session.WCSession
import java.util.*

data class WCSessionStoreItem(
        val session: WCSession,
        val peerId: String,
        val remotePeerId: String,
        val remotePeerMeta: WCPeerMeta,
        val isAutoSign: Boolean = false,
        val date: Date = Date()
)

interface WCSessionStore {
    var session: WCSessionStoreItem?
}