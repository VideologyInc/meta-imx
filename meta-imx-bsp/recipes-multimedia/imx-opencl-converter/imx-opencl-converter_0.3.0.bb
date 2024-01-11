# Copyright 2023 NXP
DESCRIPTION = "NXP Multimedia opencl converter lib"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f" 
DEPENDS = "opencl-headers"
DEPENDS:append:mx95-nxp-bsp = " virtual/opencl-icd"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "0e57c076b8a9f5aad6b29f506a6191ca"
SRC_URI[sha256sum] = "6687309892e96570278ae3517b1dfc665beba682480cb6d687c2a15229111585"

inherit fsl-eula-unpack autotools pkgconfig meson

FILES:${PN} += "${datadir}/"

COMPATIBLE_MACHINE               = "(^$)"
COMPATIBLE_MACHINE:imxgpu        = "(mx8-nxp-bsp|mx95-nxp-bsp)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp = "(^$)"
