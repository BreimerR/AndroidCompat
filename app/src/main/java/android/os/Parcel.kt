package android.os


fun Parcel.readBooleanCompat(): Boolean {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        this.readBoolean()
    } else readInt() == 1
}

fun Parcel.writeBooleanCompat(boolean: Boolean) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        writeBoolean(boolean)
    } else writeInt(if (boolean) 1 else 0)
}
