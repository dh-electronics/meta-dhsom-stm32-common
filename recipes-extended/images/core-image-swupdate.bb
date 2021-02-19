SUMMARY = "Rootfile system for swupdate as rescue system for drc rubin"
DESCRIPTION = "Root FS to start swupdate in rescue mode	\
		"
LICENSE = "MIT"
require recipes-extended/images/swupdate-image.inc
IMAGE_ROOTFS_SIZE = "100000"

PACKAGE_INSTALL += " \
	libubootenv-bin \
	libgpiod \
	e2fsprogs-mke2fs \
"
IMAGE_FSTYPES += "${INITRAMFS_FSTYPES}"
